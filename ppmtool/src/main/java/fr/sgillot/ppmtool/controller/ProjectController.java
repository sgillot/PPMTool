package fr.sgillot.ppmtool.controller;

import fr.sgillot.ppmtool.domain.Project;
import fr.sgillot.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
        Project pr = projectService.saveOrUpdate(project);
        return new ResponseEntity<>(project , HttpStatus.CREATED);
    }
}
