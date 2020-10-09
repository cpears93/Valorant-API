package com.example.Valorant.components;

import com.example.Valorant.models.Agent;
import com.example.Valorant.models.Arsenal;
import com.example.Valorant.models.Map;
import com.example.Valorant.repository.AgentRepository;
import com.example.Valorant.repository.ArsenalRepository;
import com.example.Valorant.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AgentRepository agentRepository;

    @Autowired
    MapRepository mapRepository;

    @Autowired
    ArsenalRepository arsenalRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Agent jett = new Agent("Jett", "Duelist", "Updraft", "Tailwind", "Cloudburst", "Blade Storm");
        agentRepository.save(jett);

        Agent raze = new Agent("Raze", "Duelist", "Blast Pack", "Paint Shells", "Boom Bot", "Showstopper");
        agentRepository.save(raze);

        Agent breach = new Agent("Breach", "Initiator", "Flashpoint", "Fault Line", "Aftershock", "Rolling Thunder");
        agentRepository.save(breach);

        Agent omen = new Agent("Omen", "Controller", "Paranoia", "Dark Cover", "Shrouded Step", "From The Shadows");
        agentRepository.save(omen);

        Agent brimstone = new Agent("Brimstone", "Controller", "Incendiary", "Sky Smoke", "Stim Beacon", "Orbital Strike");
        agentRepository.save(brimstone);

        Agent phoenix = new Agent("Phoenix", "Duelist", "Curveball", "Hot Hands", "Blaze", "Run It Back");
        agentRepository.save(phoenix);

        Agent sage = new Agent("Sage", "Sentinel", "Slow Orb", "Healing Orb", "Barrier Orb", "Resurrection");
        agentRepository.save(sage);

        Agent sova = new Agent("Sova", "Initiator", "Shock Bolt", "Recon Bolt", "Owl Drone", "Hunter's Fury");
        agentRepository.save(sova);

        Agent viper = new Agent("Viper", "Controller", "Poison Cloud", "Toxic Screen", "Snake Bite", "Viper's Pit");
        agentRepository.save(viper);

        Agent cypher = new Agent("Cypher", "Sentinel", "Cyber Cage", "Spycam", "Trapwire", "Neural Theft");
        agentRepository.save(cypher);

        Agent reyna = new Agent("Reyna", "Duelist", "Devour", "Dismiss", "Leer", "Empress");
        agentRepository.save(reyna);

        Agent killjoy = new Agent("Killjoy", "Initiator", "Turret", "Nanoswarm", "Alarmbot", "Lockdown");
        agentRepository.save(killjoy);

        Agent skye = new Agent("Skye", "Controller", "Regrowth", "Trailblazer", "Guiding Light", "Seekers");
        agentRepository.save(skye);


        Map bind = new Map("Bind");
        mapRepository.save(bind);

        Map haven = new Map("Haven");
        mapRepository.save(haven);

        Map split = new Map("Split");
        mapRepository.save(split);

        Map ascent = new Map("Ascent");
        mapRepository.save(ascent);

        Map icebox = new Map("Icebox");
        mapRepository.save(icebox);


        Arsenal classic = new Arsenal("Classic", "Sidearms");
        arsenalRepository.save(classic);

        Arsenal shorty = new Arsenal("Shorty", "Sidearms");
        arsenalRepository.save(shorty);

        Arsenal frenzy = new Arsenal("Frenzy", "Sidearms");
        arsenalRepository.save(frenzy);

        Arsenal ghost = new Arsenal("Ghost", "Sidearms");
        arsenalRepository.save(ghost);

        Arsenal sheriff = new Arsenal("Sheriff", "Sidearms");
        arsenalRepository.save(sheriff);

        Arsenal stinger = new Arsenal("Stinger", "SMGS");
        arsenalRepository.save(stinger);

        Arsenal spectre = new Arsenal("Spectre", "SMGS");
        arsenalRepository.save(spectre);

        Arsenal bucky = new Arsenal("Bucky", "Shotguns");
        arsenalRepository.save(bucky);

        Arsenal judge = new Arsenal("Judge", "Shotguns");
        arsenalRepository.save(judge);

        Arsenal bulldog = new Arsenal("Bulldog", "Rifles");
        arsenalRepository.save(bulldog);

        Arsenal guardian = new Arsenal("Guardian", "Rifles");
        arsenalRepository.save(guardian);

        Arsenal phantom = new Arsenal("Phantom", "Rifles");
        arsenalRepository.save(phantom);

        Arsenal marshal = new Arsenal("Marshal", "Snipers");
        arsenalRepository.save(marshal);

        Arsenal operator = new Arsenal("Operator", "Rifles");
        arsenalRepository.save(operator);

        Arsenal ares = new Arsenal("Ares", "Heavies");
        arsenalRepository.save(ares);

        Arsenal odin = new Arsenal("Odin", "Heavies");
        arsenalRepository.save(odin);

        Arsenal tacticalKnife = new Arsenal("Tactical Knife", "Melee");
        arsenalRepository.save(tacticalKnife);
    }
}
