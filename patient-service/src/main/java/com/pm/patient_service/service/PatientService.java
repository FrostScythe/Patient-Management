package com.pm.patient_service.service;

import com.pm.patient_service.dto.PatientRequestDTO;
import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.exception.EmailAlreadyExistsException;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    //constructor
    public PatientService(PatientRepository patientRepository){
        this.patientRepository =patientRepository;
    }

    //method

    //Get All Patient
    public List<PatientResponseDTO> getPatients(){
        List <Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDTO).toList();
    }

    // Adding new patient
    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO){
        // an email address must be unique
        if(patientRepository.existsByEmail(patientRequestDTO.getEmail())){
            throw new EmailAlreadyExistsException("A patient with "+patientRequestDTO.getEmail()+" already exists");
        }
        Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));

        return PatientMapper.toDTO(newPatient);
    }
}