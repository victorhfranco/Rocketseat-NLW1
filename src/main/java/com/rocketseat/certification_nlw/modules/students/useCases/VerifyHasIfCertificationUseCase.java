package com.rocketseat.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyHasIfCertificationUseCase {

	public boolean execute(VerifyHasCertificationDTO dto) {

		if(dto.getEmail().equals("Victor@gmail.com") && dto.getTechnology().equals("JAVA")) {
			return true;
		}
		return false;
	}
}
