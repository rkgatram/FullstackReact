package com.rkgatram.ppmtool.services;

import com.rkgatram.ppmtool.domain.Project;
import com.rkgatram.ppmtool.exceptions.ProjectIdException;
import com.rkgatram.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by ravikumar.g
 * Date 2021-07-20
 */

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch (Exception ex){
            throw new ProjectIdException("Project Id " + project.getProjectIdentifier().toUpperCase() + " already exists");
        }
    }

    public Project findProjectByIdentifier(String projectId){

        Optional<Project> optionalProject = projectRepository.findByProjectIdentifier(projectId.toUpperCase());

        return optionalProject.orElseThrow(() -> new ProjectIdException("Project Id " + projectId.toUpperCase() + " does not exist"));
    }

    public List<Project> findAll(){
        return projectRepository.findAll();
    }
}
