/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.rcnl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.opensim.utils.ErrorDialog;
import org.opensim.modeling.Model;
import org.opensim.view.pub.OpenSimDB;

@ActionID(
        category = "Edit",
        id = "org.opensim.rcnl.NCPPersonalizationAction"
)
@ActionRegistration(
        displayName = "#CTL_NCPPersonalizationAction"
)
@Messages("CTL_NCPPersonalizationAction=Personalize Neural Control")
public final class NeuralControlPersonalizationAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
       Model model = OpenSimDB.getInstance().getCurrentModel();
      if(model==null){
          NotifyDescriptor.Message dlg =
                          new NotifyDescriptor.Message("Error while initializing Neural Control Personalization tool. No current model to personalize");
                  DialogDisplayer.getDefault().notify(dlg);
          return;
      }

      try {
         final NCPPersonalizationJPanel jpPanel = new NCPPersonalizationJPanel(model);
         BaseToolPanel.openToolDialog(jpPanel, "Neural Control Personalization Tool");
      } catch (IOException ex) {
         ErrorDialog.displayIOExceptionDialog("Neural Control Personalization Error",
                    "Error while initializing Neural Control Personalization tool",ex);
      }

        ;
    }
}
