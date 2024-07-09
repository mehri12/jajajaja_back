package com.example.start.Controllers;

import com.example.start.Entities.File;
import com.example.start.Services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
//@CrossOrigin(value = "*")
@CrossOrigin(value = "https://www.tie-job.com")
public class FileController {

	   @Autowired
	    FileService file;
	    @PostMapping("/ajoutfile")
	    public String addfile(MultipartFile f) throws IOException {
	        file.addfile(f);
	        return "file ajoutèe";
	    }
	     @PostMapping("/ajoutfile/{id}")
	    public String addfile(@RequestParam("file") MultipartFile f,@PathVariable Long

	    id) throws IOException {

	    file.addfile(f,id);
	    return "file ajoutèe";
	    }
	
	    @GetMapping("/getfileemploye/{id}")
	    public File getfileemp(@PathVariable Long id) throws IOException {
	    	System.out.println("okkk");
	        return file.getfileemp(id);
	    }
	    @GetMapping("/getcv/{id}")
	    public File getcv(@PathVariable Long id) throws IOException {
	    	
	        return file.getcv(id);
	    }
	  
	  
	    @PostMapping("/updatecv/{id}")
	    public File updatecv(@PathVariable Long id,@RequestParam("file") MultipartFile f) throws IOException {
	        
	        return file.updatecv(id, f);
	    }

}
