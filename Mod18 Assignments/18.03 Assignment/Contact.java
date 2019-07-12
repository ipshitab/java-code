/**
 * Class List implements the sequential and binary search algorithms on a collection 
 * of contacts
 *
 * @Ipshita Bhatnagar
 * @4/27
 */
public class Contact
{
    // instance variables - replace the example below with your own
    private String entryName;
    private String relation;
    private String birthday;
    private String number;
    private String email;

    /**
     * Constructor for objects of class List
     */
    public Contact(String entryName, String relation, String birthday, String number, String email)
    {
        // initialise instance variables
        this.entryName = entryName;
        this.relation = relation;
        this.birthday = birthday;
        this.number = number;
        this.email = email;
    }
    
    public String getentryName()
    {
        return entryName;
    }
    
    public void setentryName(String n)
    {
        entryName = n;
    }
    
    public String getRelation()
    {
        return relation;
    }
    
    public void setRelation(String r)
    {
        relation = r;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String b)
    {
        birthday = b;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public void setNumber(String num)
    {
        number = num;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String e)
    {
        email = e;
    }
    
    public String toString()
    {
        return "entry name: " + entryName + ", relation: " + relation + ", birthday: " + birthday + ", number: " + number + ", email: " + email;
    }
}