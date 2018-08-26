package remove_switch;

/**
 * @Author:Knight
 * @Date:Create in 8/26/2018
 * @Description:
 */
public class Factory {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    public static Employee getEmployee(int type,Employee employee){
        switch (type) {
            case ENGINEER:
                return new Engineer(employee);
            case SALESMAN:
                return new Salesman(employee);
            case MANAGER:
                return new Manager(employee);
            default:
                throw new RuntimeException("Incorrect employee");

        }
    }
}
