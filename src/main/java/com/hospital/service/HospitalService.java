package com.hospital.service;

import com.hospital.model.Appointment;
import com.hospital.model.Patient;
import java.util.ArrayList;
import java.util.List;

public class HospitalService {
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public boolean registerPatient(Patient patient) {
        if (patient == null || patient.getId() == null || patient.getName().trim().isEmpty() || patient.getAge() <= 0) {
            return false;
        }
        patients.add(patient);
        return true;
    }

    public boolean bookAppointment(Appointment appointment) {
        if (appointment == null || appointment.getAppointmentId() == null || appointment.getConsultationFee() < 0) {
            return false;
        }
        appointments.add(appointment);
        return true;
    }

    public double calculateTotalBill(double consultationFee, double medicineCharges, boolean isInsured) {
        double total = consultationFee + medicineCharges;
        if (isInsured) {
            total = total * 0.80; // 20% discount for insured patients
        }
        return total;
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}