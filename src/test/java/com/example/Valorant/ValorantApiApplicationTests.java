package com.example.Valorant;

import com.example.Valorant.models.Agent;
import com.example.Valorant.models.Arsenal;
import com.example.Valorant.models.Map;
import com.example.Valorant.repository.AgentRepository;
import com.example.Valorant.repository.ArsenalRepository;
import com.example.Valorant.repository.MapRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class ValorantApiApplicationTests {

	@Autowired
	AgentRepository agentRepository;

	@Autowired
	MapRepository mapRepository;

	@Autowired
	ArsenalRepository arsenalRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAgentAndMapThenSave(){
		Agent jett = new Agent("Jett", "Duelist", "Updraft", "Tailwind", "Cloudburst", "Blade Storm");
		agentRepository.save(jett);
		Map bind = new Map("Bind");
		mapRepository.save(bind);
	}

	@Test
	public void createAgentAndArsenalThenSave(){
		Agent viper = new Agent("Viper", "Controller", "Poison Cloud", "Toxic Screen", "Snake Bite", "Viper's Pit");
		agentRepository.save(viper);
		Map ascent = new Map("Ascent");
		mapRepository.save(ascent);
		Arsenal ghost = new Arsenal("Ghost", "Sidearms");
		arsenalRepository.save(ghost);
	}

	@Test
	public void canFindAgentByName(){
		List<Agent> found = agentRepository.findByName("Phoenix");
		assertEquals("Phoenix", found.get(0).getName());
	}

	@Test
	public void canFindAgentByRole(){
		List<Agent> found = agentRepository.findByRole("Duelist");
		assertEquals("Duelist", found.get(0).getRole());
	}

	@Test
	public void canFindAgentBySpecialAbilityQ(){
		List<Agent> found = agentRepository.findBySpecialAbilityQ("Slow Orb");
		assertEquals("Slow Orb", found.get(0).getSpecialAbilityQ());
	}

	@Test
	public void canFindAgentBySpecialAbilityE(){
		List<Agent> found = agentRepository.findBySpecialAbilityE("Dismiss");
		assertEquals("Dismiss", found.get(0).getSpecialAbilityE());
	}

	@Test
	public void canFindAgentBySpecialAbilityC(){
		List<Agent> found = agentRepository.findBySpecialAbilityC("Owl Drone");
		assertEquals("Owl Drone", found.get(0).getSpecialAbilityC());
	}

	@Test
	public void canFindAgentBySpecialAbilityX(){
		List<Agent> found = agentRepository.findBySpecialAbilityX("Showstopper");
		assertEquals("Showstopper", found.get(0).getSpecialAbilityX());
	}

	@Test
	public void canGetMapName(){
		List<Map> found = mapRepository.findByName("Haven");
		assertEquals("Haven", found.get(0).getName());
	}

	@Test
	public void canGetArsenalName(){
		List<Arsenal> found = arsenalRepository.findByName("Bucky");
		assertEquals("Bucky", found.get(0).getName());
	}

	@Test
	public void canGetArsenalType(){
		List<Arsenal> found = arsenalRepository.findByType("Heavies");
		assertEquals("Heavies", found.get(0).getType());
	}

}
