package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public Facade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> searchEmployeeByARG(String arg) {
        return employeeDao.searchEmployeeByARG("%" + arg + "%");
    }

    public List<Company> searchCompanyByARG(String arg) {
        return companyDao.searchCompanyByARG("%" + arg + "%");
    }
}
