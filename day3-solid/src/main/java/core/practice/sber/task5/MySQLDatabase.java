package core.practice.sber.task5;

class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("MySQL " + data);
    }
}