package people;

public class PersonList {
    private final Person[] persons;
    private int count;
    public PersonList(int size) {
        //if size is less than 2, set it 2
        persons = new Person[size < 2 ? 2 : size];

    }
    public int size(){return count;}
    public boolean add(Person p) {
        // if p is null or the array is full or p is already exists in array return false
        // Otherwise add p in the array.
        if(p == null || count == persons.length) return false;
        for(int i = 0; i < count;i++){
            if(p == persons[i]) return false;
        }
       persons[count++] = p;
        return true;
    }

    @Override
    public String toString() {
        // return a String concatenation of all person in array.
        var sb = new StringBuilder();
        sb.append("PersonList[");
        sb.append(count).append(":");
        for (int i = 0; i < count;i++){

           sb.append(persons[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public Person remove(Person p) {
        // If p does not exist in array return null , otherwise remove p from array.
        Person newPerson;
        for(int i = 0;i < count;i++){
            if(persons[i] != null && persons[i] == p){
              newPerson  = persons[i];
              persons[i] = null;
                count--;
              return newPerson ;

              // Still bug
//              for(int d = count-1; d >= 0; d-- ){
//                  if(persons[d] != null){
//                      persons[i] = persons[d];
//                      persons[d]= null;
//                      count--;
//                      return newPerson;
//                  }
//              }
            }
        }return null;
    }

    public Person findPersonByName(String name) {
        //Find the first person that match the name.
        for(int i = 0;i < count;i++){
            if( name.equalsIgnoreCase(persons[i].getName())) return persons[i];

        }
        return null;
    }
}
