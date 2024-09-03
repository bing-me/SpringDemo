package main.appointmentdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import main.appointmentdemo.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
