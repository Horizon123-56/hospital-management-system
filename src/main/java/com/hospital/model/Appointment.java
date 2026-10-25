package com.hospital.model;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorName;
    private double consultationFee;

    public Appointment(String appointmentId, String patientId, String doctorName, double consultationFee) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    public String getAppointmentId() { return appointmentId; }
    public String getPatientId() { return patientId; }
    public String getDoctorName() { return doctorName; }
    public double getConsultationFee() { return consultationFee; }
}