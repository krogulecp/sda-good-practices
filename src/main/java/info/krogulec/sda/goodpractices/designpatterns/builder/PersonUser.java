package info.krogulec.sda.goodpractices.designpatterns.builder;

/**
 * @author krogulecp
 */
class PersonUser {

    void use(){
        Person person = new Person.Builder()
                .setFirstName("Andrzej")
                .setLastName("Kowalski")
                .setAge(24)
                .setBloodType("A")
                .setHairColor("brown")
                .setSex("man")
                .build();
    }
}
