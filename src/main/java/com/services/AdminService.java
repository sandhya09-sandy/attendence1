package com.services;

import com.model.Admin;
import com.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<Admin> getAdmin();

    Admin create(Admin admin);

    Admin getAdminById(int id);

    Admin updateAdmin(Admin admin);

    Admin deleteAdmin(int id);

}

