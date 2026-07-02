package core.practice.sber.task5;

class PostgreSQLDatabase implements Database {
    public void save(String data) {
        System.out.println("PostgreSQL " + data);
    }
}