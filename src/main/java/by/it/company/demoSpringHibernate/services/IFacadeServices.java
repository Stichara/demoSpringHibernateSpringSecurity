package by.it.company.demoSpringHibernate.services;

import by.it.company.demoSpringHibernate.exceptions.ServicesException;
import by.it.company.demoSpringHibernate.models.EmployeeModel;

import java.util.List;

public interface IFacadeServices {

    // employee methods
    EmployeeModel addNewEmployee(EmployeeModel newEmployee) throws ServicesException;

    List getEmployeesList() throws ServicesException;

    EmployeeModel getEmployee(Long idEmployee) throws ServicesException;

    void updateEmployee(Long idEmployee, EmployeeModel employeeModel) throws ServicesException;

    void deleteEmployee(Long idEmployee) throws ServicesException;

    List getEmployee(String surname) throws ServicesException;
}
