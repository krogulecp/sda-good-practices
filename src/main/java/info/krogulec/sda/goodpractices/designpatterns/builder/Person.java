package info.krogulec.sda.goodpractices.designpatterns.builder;

/**
 * @author krogulecp
 */
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String bloodType;
    private String hairColor;
    private String sex;

    private Person(){}

    static class Builder{
        private Person person = new Person();

        public Builder setFirstName(String firstName){
            person.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            person.lastName = lastName;
            return this;
        }

        public  Builder setAge(int age){
            person.age = age;
            return this;
        }

        public Builder setBloodType(String bloodType){
            person.bloodType = bloodType;
            return this;
        }

        public Builder setHairColor(String hairColor){
            person.hairColor = hairColor;
            return this;
        }

        public Builder setSex(String sex){
            person.sex = sex;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
