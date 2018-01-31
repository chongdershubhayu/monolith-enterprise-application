/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.entapp.snowman.infrastructure.rest.endpoint;

import com.mycompany.entapp.snowman.domain.model.Employee;
import com.mycompany.entapp.snowman.domain.service.EmployeeService;
import com.mycompany.entapp.snowman.infrastructure.rest.mappers.EmployeeResourceMapper;
import com.mycompany.entapp.snowman.infrastructure.rest.resources.EmployeeResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(EmployeeResourceMapper.class)
public class EmployeeRestEndpointUTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeRestEndpoint systemUnderTest = new EmployeeRestEndpoint();

    @Test
    public void testCreateEmployeeShouldCreateEmployee() {
        PowerMockito.mockStatic(EmployeeResourceMapper.class);

        Employee employee = new Employee();

        EmployeeResource employeeResource = new EmployeeResource();

        PowerMockito.when(EmployeeResourceMapper.mapEmployeeResourceToEmployee(employeeResource)).thenReturn(employee);

        systemUnderTest.createEmployee(employeeResource);
    }

}
