package com.xworkz.ipl.boot;

import java.sql.Date;
import java.time.Clock;
import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository repository = new IplRepositoryImpl();
		IplDTO dto = new IplDTO();
		dto.setTeamName("RCB");
		dto.setCaptainName("Virat");
		dto.setOwnerName(null);
		dto.setOwnerAlive(true);
		dto.setPurse(18);
		dto.setWins(107);
		dto.setDefeats(113);
		dto.setCreatedBy("Vinay1");
		dto.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto.setUpdatedBy("Vinay2");
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		System.out.println("\n");
		
		IplDTO dto2=new IplDTO();
		dto2.setTeamName("MI");
		dto2.setCaptainName("Rohit");
		dto2.setOwnerName(null);
		dto2.setOwnerAlive(true);
		dto2.setPurse(1);
		dto2.setWins(107);
		dto2.setDefeats(113);
		dto2.setCreatedBy("Vinay1");
		dto2.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto2.setUpdatedBy("Vinay2");
		dto2.setUpdatedDate(LocalDateTime.now());
		repository.create(dto2);
		System.out.println("\n");

		IplDTO dto3=new IplDTO();
		dto3.setTeamName("SRH");
		dto3.setCaptainName("Bhuvaneshwar Kumar");
		dto3.setOwnerName("SUN Group");
		dto3.setOwnerAlive(true);
		dto3.setPurse(10);
		dto3.setWins(105);
		dto3.setDefeats(54);
		dto3.setCreatedBy("Vinay1");
		dto3.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto3.setUpdatedBy("Vinay2");
		dto3.setUpdatedDate(LocalDateTime.now());
		repository.create(dto3);
		System.out.println("\n");

		IplDTO dto4=new IplDTO();
		dto4.setTeamName("Delhi Captals");
		dto4.setCaptainName("Rishab Panth");
		dto4.setOwnerName("GMR Group, JSW Group");
		dto4.setOwnerAlive(true);
		dto4.setPurse(18);
		dto4.setWins(107);
		dto4.setDefeats(113);
		dto4.setCreatedBy("Vinay1");
		dto4.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto4.setUpdatedBy("Vinay2");
		dto4.setUpdatedDate(LocalDateTime.now());
		repository.create(dto4);
		System.out.println("\n");

		IplDTO dto5=new IplDTO();
		dto5.setTeamName("KKR");
		dto5.setCaptainName("Shreyas Iyer");
		dto5.setOwnerName("Red Chillies Entertainment, Shah Rukh Khan");
		dto5.setOwnerAlive(true);
		dto5.setPurse(18);
		dto5.setWins(107);
		dto5.setDefeats(113);
		dto5.setCreatedBy("Vinay1");
		dto5.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto5.setUpdatedBy("Vinay2");
		dto5.setUpdatedDate(LocalDateTime.now());
		repository.create(dto5);
		System.out.println("\n");

		IplDTO dto6=new IplDTO();
		dto6.setTeamName("RR");
		dto6.setCaptainName("Sanju Samson");
		dto6.setOwnerName("Manoj Badale, Lachlan Murdoch");
		dto6.setOwnerAlive(true);
		dto6.setPurse(18);
		dto6.setWins(107);
		dto6.setDefeats(113);
		dto6.setCreatedBy("Vinay1");
		dto6.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto6.setUpdatedBy("Vinay2");
		dto6.setUpdatedDate(LocalDateTime.now());
		repository.create(dto6);
		System.out.println("\n");

		IplDTO dto7=new IplDTO();
		dto7.setTeamName("Punjab Kings");
		dto7.setCaptainName("Virat");
		dto7.setOwnerName("Preety Zinta");
		dto7.setOwnerAlive(true);
		dto7.setPurse(18);
		dto7.setWins(107);
		dto7.setDefeats(113);
		dto7.setCreatedBy("Vinay1");
		dto7.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto7.setUpdatedBy("Vinay2");
		dto7.setUpdatedDate(LocalDateTime.now());
		repository.create(dto7);
		System.out.println("\n");

		IplDTO dto8=new IplDTO();
		dto8.setTeamName("CSK");
		dto8.setCaptainName("Ravindra Jadeja");
		dto8.setOwnerName("CSK Cricket ltd");
		dto8.setOwnerAlive(true);
		dto8.setPurse(18);
		dto8.setWins(107);
		dto8.setDefeats(113);
		dto8.setCreatedBy("Vinay1");
		dto8.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto8.setUpdatedBy("Vinay2");
		dto8.setUpdatedDate(LocalDateTime.now());
		repository.create(dto8);
		System.out.println("\n");

		IplDTO dto9=new IplDTO();
		dto9.setTeamName("Lucknow Super Giants");
		dto9.setCaptainName("KL Rahul");
		dto9.setOwnerName("RPSG Group");
		dto9.setOwnerAlive(true);
		dto9.setPurse(18);
		dto9.setWins(107);
		dto9.setDefeats(113);
		dto9.setCreatedBy("Vinay1");
		dto9.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto9.setUpdatedBy("Vinay2");
		dto9.setUpdatedDate(LocalDateTime.now());
		repository.create(dto9);
		System.out.println("\n");

		IplDTO dto10=new IplDTO();
		dto10.setTeamName("Gujrat Titans");
		dto10.setCaptainName("Hardik Pandya");
		dto10.setOwnerName("CVC Captal Partners");
		dto10.setOwnerAlive(true);
		dto10.setPurse(18);
		dto10.setWins(107);
		dto10.setDefeats(113);
		dto10.setCreatedBy("Vinay1");
		dto10.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto10.setUpdatedBy("Vinay2");
		dto10.setUpdatedDate(LocalDateTime.now());
		repository.create(dto10);
		System.out.println("\n");

		IplDTO dto11=new IplDTO();
		dto11.setTeamName("Kochi Tuskers Kerala");
		dto11.setCaptainName("Mahela Jayavardene");
		dto11.setOwnerName("Kochi Cricket ltd");
		dto11.setOwnerAlive(true);
		dto11.setPurse(18);
		dto11.setWins(107);
		dto11.setDefeats(113);
		dto11.setCreatedBy("Vinay1");
		dto11.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto11.setUpdatedBy("Vinay2");
		dto11.setUpdatedDate(LocalDateTime.now());
		repository.create(dto11);
		System.out.println("\n");

	}
}
