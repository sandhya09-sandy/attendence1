package com.controller;

import com.model.Admin;
import com.model.Student;
import com.services.AdminService;
import com.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value="/admin")
public class AdminController{

    @Autowired
    AdminService adminService;


    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @GetMapping
    public List<Admin> getAdmin() {
        logger.info("Admin List");
        return adminService.getAdmin();
    }

    @PostMapping("/create")
    public Admin create(@RequestBody Admin admin) {
        logger.info("create admin is invoked{}", admin);
        return adminService.create(admin);
    }
    @GetMapping("/id")
    public Admin getAdminById(@PathVariable("id")int id)
    {
        logger.info("get admin is invoked {}");
        return adminService.getAdminById(id);
    }
    @PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin admin)
    {
        logger.info("update admin is invoked {}");
        return adminService.updateAdmin(admin);
    }
    @DeleteMapping("/id")
    public Admin deleteAdmin(@PathVariable("id") int id)
    {
        logger.info("delete admin is invoked {}");
        return adminService.deleteAdmin(id);
    }
}
