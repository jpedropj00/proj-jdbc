package models.dao;

import models.entities.Department;
import java.util.List;
import java.io.Serializable;

public interface DepartmentDao {
    void insertDepartment(Department department);
    void updateDepartment(Department department);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
