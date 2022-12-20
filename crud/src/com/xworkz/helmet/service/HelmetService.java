package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.HelmetDTO;

public interface HelmetService {

	boolean validateAndSave(HelmetDTO dto);
}
