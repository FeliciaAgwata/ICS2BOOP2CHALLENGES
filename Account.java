public abstract class Account {

    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();
    }

    // Admin class as a static inner class
    static class Admin extends Account {

        private String authPassword;

        public Admin(int _id, String _name, String _password) {
            this.id = _id;
            this.name = _name;
            this.authPassword = _password;
        }
    }

    // User class as a static inner class
    static class User extends Account {

        public User(int _id, String _name) {
            this.id = _id;
            this.name = _name;
        }
    }

    // DataSource interface
    interface DataSource {
        void execute();
    }

    // Delete operation
    static class Delete implements DataSource {
        @Override
        public void execute() {
            System.out.println("Data has been deleted.");
        }
    }

    // Update operation
    static class Update implements DataSource {
        @Override
        public void execute() {
            System.out.println("Data has been updated successfully!");
        }
    }

    // View operation
    static class View implements DataSource {
        @Override
        public void execute() {
            System.out.println("Some data to be displayed.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Felicia", "123456778q");
        User curUser = new User(4455, "Mary");

        curAdmin.performOperation(new Update()); // Admin updates data
        curUser.performOperation(new View());    // User views data
    }
}
