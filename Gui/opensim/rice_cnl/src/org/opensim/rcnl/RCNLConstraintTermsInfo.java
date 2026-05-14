/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.opensim.rcnl;

/**
 *
 * @author ayman
 */
public class RCNLConstraintTermsInfo {
    static String[][] trackingConstraintTerms= {
        {   "generalized_coordinate_deviation", "generalized_coordinate_value", "generalized_coordinate_periodicity", 
            "initial_generalized_coordinate_deviation", "initial_generalized_coordinate_value", "final_generalized_coordinate_deviation",
            "final_generalized_coordinate_value", "generalized_speed_deviation", "generalized_speed_value", 
            "generalized_speed_periodicity", "initial_generalized_speed_deviation", "initial_generalized_speed_value", 
            "final_generalized_speed_deviation", "final_generalized_speed_value", "generalized_acceleration_deviation", 
            "generalized_acceleration_value", "marker_position_deviation", "marker_position_value", 
            "marker_position_periodicity", "initial_marker_position_deviation", "initial_marker_position_value", 
            "final_marker_position_deviation", "final_marker_position_value", "marker_velocity_deviation", 
            "marker_velocity_value", "marker_velocity_periodicity", "initial_marker_velocity_deviation",
            "initial_marker_velocity_value", "final_marker_velocity_deviation", "final_marker_velocity_value",
            "body_orientation_deviation", "body_orientation_value", "body_orientation_periodicity",
            "initial_body_orientation_deviation", "initial_body_orientation_value", "final_body_orientation_deviation",
            "final_body_orientation_value", "kinetic_consistency", "root_segment_residual_load", 
            "root_segment_residual_load_periodicity", "external_force_deviation", "external_force_value",
            "external_force_periodicity", "initial_external_force_deviation", "initial_external_force_value",
            "final_external_force_deviation", "final_external_force_value", "external_moment_deviation",
            "external_moment_value", "external_moment_periodicity", "initial_external_moment_deviation",
            "initial_external_moment_value", "final_external_moment_deviation", "final_external_moment_value",
            "synergy_vector_sum", "synergy_vector_magnitude"},

        {   "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "body", "body", "body",
            "body", "body", "body",
            "body", "load", "load", 
            "load", "force", "force",
            "force", "force", "force",
            "force", "force", "moment", 
            "moment", "moment", "moment",
            "moment", "moment", "moment",
            "synergy_group", "synergy_group"}
    };
    static String[][] verificationConstraintTerms= {
        {   "generalized_coordinate_deviation", "generalized_coordinate_value", "generalized_coordinate_periodicity", 
            "initial_generalized_coordinate_deviation", "initial_generalized_coordinate_value", "final_generalized_coordinate_deviation",
            "final_generalized_coordinate_value", "generalized_speed_deviation", "generalized_speed_value", 
            "generalized_speed_periodicity", "initial_generalized_speed_deviation", "initial_generalized_speed_value", 
            "final_generalized_speed_deviation", "final_generalized_speed_value", "generalized_acceleration_deviation", 
            "generalized_acceleration_value", "marker_position_deviation", "marker_position_value", 
            "marker_position_periodicity", "initial_marker_position_deviation", "initial_marker_position_value", 
            "final_marker_position_deviation", "final_marker_position_value", "marker_velocity_deviation", 
            "marker_velocity_value", "marker_velocity_periodicity", "initial_marker_velocity_deviation",
            "initial_marker_velocity_value", "final_marker_velocity_deviation", "final_marker_velocity_value",
            "body_orientation_deviation", "body_orientation_value", "body_orientation_periodicity",
            "initial_body_orientation_deviation", "initial_body_orientation_value", "final_body_orientation_deviation",
            "final_body_orientation_value", "kinetic_consistency", "root_segment_residual_load", 
            "root_segment_residual_load_periodicity", "external_force_deviation", "external_force_value",
            "external_force_periodicity", "initial_external_force_deviation", "initial_external_force_value",
            "final_external_force_deviation", "final_external_force_value", "external_moment_deviation",
            "external_moment_value", "external_moment_periodicity", "initial_external_moment_deviation",
            "initial_external_moment_value", "final_external_moment_deviation", "final_external_moment_value"},
        
        {   "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "body", "body", "body",
            "body", "body", "body",
            "body", "load", "load", 
            "load", "force", "force",
            "force", "force", "force",
            "force", "force", "moment", 
            "moment", "moment", "moment",
            "moment", "moment", "moment"}
    };
    static String[][] designOptimizationConstraintTerms= {
        {   "generalized_coordinate_deviation", "generalized_coordinate_value", "generalized_coordinate_periodicity", 
            "initial_generalized_coordinate_deviation", "initial_generalized_coordinate_value", "final_generalized_coordinate_deviation",
            "final_generalized_coordinate_value", "generalized_speed_deviation", "generalized_speed_value", 
            "generalized_speed_periodicity", "initial_generalized_speed_deviation", "initial_generalized_speed_value", 
            "final_generalized_speed_deviation", "final_generalized_speed_value", "generalized_acceleration_deviation", 
            "generalized_acceleration_value", "marker_position_deviation", "marker_position_value", 
            "marker_position_periodicity", "initial_marker_position_deviation", "initial_marker_position_value", 
            "final_marker_position_deviation", "final_marker_position_value", "marker_velocity_deviation", 
            "marker_velocity_value", "marker_velocity_periodicity", "initial_marker_velocity_deviation",
            "initial_marker_velocity_value", "final_marker_velocity_deviation", "final_marker_velocity_value",
            "body_orientation_deviation", "body_orientation_value", "body_orientation_periodicity",
            "initial_body_orientation_deviation", "initial_body_orientation_value", "final_body_orientation_deviation",
            "final_body_orientation_value", "kinetic_consistency", "root_segment_residual_load", 
            "root_segment_residual_load_periodicity", "external_force_deviation", "external_force_value",
            "external_force_periodicity", "initial_external_force_deviation", "initial_external_force_value",
            "final_external_force_deviation", "final_external_force_value", "external_moment_deviation",
            "external_moment_value", "external_moment_periodicity", "initial_external_moment_deviation",
            "initial_external_moment_value", "final_external_moment_deviation", "final_external_moment_value",
            "synergy_vector_sum", "synergy_vector_magnitude", "limit_muscle_activation", 
            "limit_normalized_fiber_length"},
        {   "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "coordinate", "coordinate", 
            "coordinate", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "marker", "marker", "marker", 
            "body", "body", "body",
            "body", "body", "body",
            "body", "load", "load", 
            "load", "force", "force",
            "force", "force", "force",
            "force", "force", "moment", 
            "moment", "moment", "moment",
            "moment", "moment", "moment",
            "synergy_group", "synergy_group", "muscle", 
            "muscle"}
    };
    
    public static String[] getConstraintTermTypes(TreatmentOptimizationToolModel.Mode mode) {
        switch(mode){
            case TrackingOptimization:
                return trackingConstraintTerms[0];
            case VerificationOptimization:
                return verificationConstraintTerms[0];
            case DesignOptimization:
                return designOptimizationConstraintTerms[0];
        }
        return new String[]{};
    }
   public static String[] getConstraintTermQuantityTypes(TreatmentOptimizationToolModel.Mode mode) { 
        switch(mode){
            case TrackingOptimization:
                return trackingConstraintTerms[1];
            case VerificationOptimization:
                return verificationConstraintTerms[1];
            case DesignOptimization:
                return designOptimizationConstraintTerms[1];
        }
        return new String[]{};
   }       
}
