package learnedma.generated;

import java.util.ArrayList;
import java.util.Collection;
import org.abstractica.edma.metamodel.IMetaEnvironment;
import org.abstractica.edma.metamodel.impl.MetaEnvironment;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder.Field;
import org.abstractica.edma.runtime.implementations.mem.modelstore.speed.newindex.IndexUtil;
import org.abstractica.edma.runtime.intf.IRuntimeFactory;
import org.abstractica.edma.valuedomains.impl.Constraint;

/**
 * 
 */
public class LearnEDMA
{
    public static final IMetaEnvironment environment = generateEnvironment();



    /**
     * generate the environment
     * @return  
     */
    public static IMetaEnvironment generateEnvironment()
    {
        ValueDomainBuilder vdb = new ValueDomainBuilder();
        
        //Integer value domain: Year
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Year", null, 0, 9999, edma_constraints, false);
        }
        
        //Integer value domain: Month
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Month", null, 1, 12, edma_constraints, false);
        }
        
        //Integer value domain: DayOfMonth
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("DayOfMonth", null, 1, 31, edma_constraints, false);
        }
        
        //Struct value domain: Date
        {
            ArrayList<Constraint> edma_constraints = new ArrayList<Constraint>(1);
            edma_constraints.add(new Constraint("validDate", "No description given"));
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("year", "Year", false));
            fields.add(vdb.newStructField("month", "Month", false));
            fields.add(vdb.newStructField("day", "DayOfMonth", false));
            vdb.newStructDomain("Date", null, fields, edma_constraints, false);
        }
        
        //Integer value domain: Hour
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Hour", null, 0, 23, edma_constraints, false);
        }
        
        //Integer value domain: Minute
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Minute", null, 0, 59, edma_constraints, false);
        }
        
        //Integer value domain: Second
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Second", null, 0, 59, edma_constraints, false);
        }
        
        //Integer value domain: Millisecond
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("Millisecond", null, 0, 999, edma_constraints, false);
        }
        
        //Struct value domain: Time
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("hour", "Hour", false));
            fields.add(vdb.newStructField("min", "Minute", false));
            fields.add(vdb.newStructField("second", "Second", false));
            fields.add(vdb.newStructField("milliseconds", "Millisecond", false));
            vdb.newStructDomain("Time", null, fields, edma_constraints, false);
        }
        
        //Struct value domain: DateAndTime
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("date", "Date", false));
            fields.add(vdb.newStructField("time", "Time", false));
            vdb.newStructDomain("DateAndTime", null, fields, edma_constraints, false);
        }
        
        //String value domain: Name
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Name", null, 1, null, null, edma_constraints, false);
        }
        
        //String value domain: Email
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Email", null, 3, null, "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", edma_constraints, false);
        }
        
        //String value domain: Mobile
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Mobile", null, 8, 8, "[0-9]+", edma_constraints, false);
        }
        
        //String value domain: AddressLine
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("AddressLine", null, 1, null, null, edma_constraints, false);
        }
        
        //String value domain: City
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("City", null, 1, null, null, edma_constraints, false);
        }
        
        //Integer value domain: ZipCode
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("ZipCode", null, 1000, 9999, edma_constraints, false);
        }
        
        //Struct value domain: Address
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("line1", "AddressLine", false));
            fields.add(vdb.newStructField("line2", "AddressLine", true));
            fields.add(vdb.newStructField("city", "City", false));
            fields.add(vdb.newStructField("zipCode", "ZipCode", false));
            vdb.newStructDomain("Address", null, fields, edma_constraints, false);
        }
        
        //Integer value domain: AnyInt
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("AnyInt", null, null, null, edma_constraints, false);
        }
        
        //Integer value domain: PosInt
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("PosInt", null, 1, null, edma_constraints, false);
        }
        
        //Integer value domain: NotNegInt
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newIntegerDomain("NotNegInt", null, 0, null, edma_constraints, false);
        }
        
        //String value domain: AnyString
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("AnyString", null, null, null, null, edma_constraints, false);
        }
        
        //Struct value domain: Person
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("firstName", "Name", false));
            fields.add(vdb.newStructField("lastName", "Name", false));
            fields.add(vdb.newStructField("email", "Email", false));
            fields.add(vdb.newStructField("mobile", "Mobile", false));
            vdb.newStructDomain("Person", null, fields, edma_constraints, false);
        }
        
        //String value domain: OpenCurlyBracket
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("OpenCurlyBracket", null, 1, 1, "[{]", edma_constraints, false);
        }
        
        //String value domain: CloseCurlyBracket
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("CloseCurlyBracket", null, 1, 1, "[}]", edma_constraints, false);
        }
        
        //String value domain: Comma
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Comma", null, 1, 1, "[,]", edma_constraints, false);
        }
        
        //String value domain: Key
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Key", null, 1, null, null, edma_constraints, false);
        }
        
        //String value domain: Colon
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Colon", null, 1, 1, "[:]", edma_constraints, false);
        }
        
        //String value domain: Value
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Value", null, 1, null, null, edma_constraints, false);
        }
        
        //Struct value domain: JSON
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("openCurlyBracket", "OpenCurlyBracket", false));
            fields.add(vdb.newStructField("key", "Key", false));
            fields.add(vdb.newStructField("colon", "Colon", false));
            fields.add(vdb.newStructField("value", "Value", false));
            fields.add(vdb.newStructField("optionalExtras", "Optional", true));
            fields.add(vdb.newStructField("closeCurlyBracket", "CloseCurlyBracket", false));
            vdb.newStructDomain("JSON", null, fields, edma_constraints, false);
        }
        
        //Struct value domain: Optional
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("comma", "Comma", false));
            fields.add(vdb.newStructField("key", "Key", false));
            fields.add(vdb.newStructField("colon", "Colon", false));
            fields.add(vdb.newStructField("value", "Value", false));
            vdb.newStructDomain("Optional", null, fields, edma_constraints, false);
        }
        MetaEnvironment edma_environment = new MetaEnvironment("LearnEDMA");
        vdb.buildWithEnvironment(edma_environment);
        //Hack to make serializeable work...
        IndexUtil.setValueDomainDefinitions(edma_environment.getValueDomainDefinitions());
        return edma_environment;
    }

    /**
     * Constructor
     * @param factory  The runtime factory
     */
    public LearnEDMA(IRuntimeFactory factory)
    {
        
    }
}
