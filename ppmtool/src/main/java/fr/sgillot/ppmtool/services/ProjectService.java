package fr.sgillot.ppmtool.services;

import fr.sgillot.ppmtool.domain.Project;
import fr.sgillot.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project) {
        //Logic here

        return projectRepository.save(project);
    }
}
