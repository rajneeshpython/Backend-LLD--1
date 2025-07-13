package SolidPrinciples.ocp;

import java.util.HashMap;
import java.util.Map;

public class SalaryCalculatorFactory {

    private static final Map<EmployeeRole, SalaryCalculator> calculatorMap = new HashMap<>();

    static {
        System.out.println("Initializing calculator map");
        calculatorMap.put(EmployeeRole.MANAGER, new ManagerSalaryCalculator());
        calculatorMap.put(EmployeeRole.DEVELOPER, new DeveloperSalaryCalculator());
        calculatorMap.put(EmployeeRole.INTERN, new InterSalaryCalculator());
    }

    public static SalaryCalculator getCalculator(EmployeeRole role){
        SalaryCalculator calculator = calculatorMap.get(role);
        if(role == null){
            throw new IllegalArgumentException("Role cannot be null");
        }
        return calculator;
    }
}
