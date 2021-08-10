package com.arun.cucumber.hello.employee;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-10T08:54:21+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity toEmployeeEntity(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setId( employee.getId() );
        employeeEntity.setFirstName( employee.getFirstName() );
        employeeEntity.setLastName( employee.getLastName() );
        employeeEntity.setDateOfBirth( employee.getDateOfBirth() );
        employeeEntity.setStartDate( employee.getStartDate() );
        employeeEntity.setEndDate( employee.getEndDate() );
        employeeEntity.setEmploymentType( employee.getEmploymentType() );
        employeeEntity.setEmail( employee.getEmail() );
        employeeEntity.setPhones( phoneListToPhoneEntityList( employee.getPhones() ) );

        return employeeEntity;
    }

    @Override
    public Employee toEmployee(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeEntity.getId() );
        employee.setFirstName( employeeEntity.getFirstName() );
        employee.setLastName( employeeEntity.getLastName() );
        employee.setDateOfBirth( employeeEntity.getDateOfBirth() );
        employee.setStartDate( employeeEntity.getStartDate() );
        employee.setEndDate( employeeEntity.getEndDate() );
        employee.setEmploymentType( employeeEntity.getEmploymentType() );
        employee.setEmail( employeeEntity.getEmail() );
        employee.setPhones( phoneEntityListToPhoneList( employeeEntity.getPhones() ) );

        return employee;
    }

    @Override
    public PhoneEntity toPhoneEntity(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneEntity phoneEntity = new PhoneEntity();

        phoneEntity.setId( phone.getId() );
        phoneEntity.setType( phone.getType() );
        phoneEntity.setIsdCode( phone.getIsdCode() );
        phoneEntity.setPhoneNumber( phone.getPhoneNumber() );
        phoneEntity.setExtension( phone.getExtension() );

        return phoneEntity;
    }

    @Override
    public Phone toPhone(PhoneEntity phoneEntity) {
        if ( phoneEntity == null ) {
            return null;
        }

        Phone phone = new Phone();

        phone.setId( phoneEntity.getId() );
        phone.setType( phoneEntity.getType() );
        phone.setIsdCode( phoneEntity.getIsdCode() );
        phone.setPhoneNumber( phoneEntity.getPhoneNumber() );
        phone.setExtension( phoneEntity.getExtension() );

        return phone;
    }

    protected List<PhoneEntity> phoneListToPhoneEntityList(List<Phone> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneEntity> list1 = new ArrayList<PhoneEntity>( list.size() );
        for ( Phone phone : list ) {
            list1.add( toPhoneEntity( phone ) );
        }

        return list1;
    }

    protected List<Phone> phoneEntityListToPhoneList(List<PhoneEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Phone> list1 = new ArrayList<Phone>( list.size() );
        for ( PhoneEntity phoneEntity : list ) {
            list1.add( toPhone( phoneEntity ) );
        }

        return list1;
    }
}
