package designpattern.builder;

public class User {
    private String firstName;
    private String lastName;

    // Optional attributes
    private String email;
    private int age;
    private String phoneNumber;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        // Optional attributes
        private String email;
        private int age;
        private String phoneNumber;

        public Builder(String firstName, String lastName) {
            if(firstName == null || firstName.trim().isEmpty()) {
                throw new IllegalArgumentException("First name cannot be empty");
            }

            if (lastName == null || lastName.trim().isEmpty()) {
                throw new IllegalArgumentException("Last name cannot be empty");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
