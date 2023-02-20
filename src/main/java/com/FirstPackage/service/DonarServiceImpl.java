package com.FirstPackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FirstPackage.dto.DonarDto;
import com.FirstPackage.entity.Donar;
import com.FirstPackage.repository.DonarRepository;


@Service
public class DonarServiceImpl implements DonarService {
	
	@Autowired
	DonarRepository donarRepository;

	@Override
	public DonarDto addNewDonar(DonarDto donarDto) {
		// TODO Auto-generated method stub
		return convertToDto(donarRepository.save(convertToEntity(donarDto)));
	}

	@Override
	public List<DonarDto> getAllDonar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
private DonarDto convertToDto(Donar donar) {
	DonarDto donarDto=new DonarDto();
	
	donarDto.setDonarId(donar.getDonarId());
	donarDto.setDonarName(donar.getDonarName());
	donarDto.setDonarAddress(donar.getDonarAddress());
	donarDto.setDonarEmail(donar.getDonarEmail());
	donarDto.setDonarAge(donar.getDonarAge());
	donarDto.setDonarPhno(donar.getDonarPhno());
	donarDto.setDonarCity(donar.getDonarCity());
	donarDto.setDonarBloodType(donar.getDonarBloodType());
	donarDto.setDonarBloodQuantity(donar.getDonarBloodQuantity());
	
	return donarDto;
}

private Donar convertToEntity(DonarDto donarDto) {
	Donar donar=new Donar();
	
	donar.setDonarId(donarDto.getDonarId());
	donar.setDonarName(donarDto.getDonarName());
	donar.setDonarAddress(donarDto.getDonarAddress());
	donar.setDonarEmail(donarDto.getDonarEmail());
	donar.setDonarAge(donarDto.getDonarAge());
	donar.setDonarPhno(donar.getDonarPhno());
	donar.setDonarCity(donarDto.getDonarCity());
	donar.setDonarBloodType(donarDto.getDonarBloodType());
	donar.setDonarBloodQuantity(donarDto.getDonarBloodQuantity());
	
	return donar;
	
}

}


	