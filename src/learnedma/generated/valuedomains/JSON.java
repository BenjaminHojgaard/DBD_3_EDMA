package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.LearnEDMA;
import learnedma.generated.valuedomains.CloseCurlyBracket;
import learnedma.generated.valuedomains.Colon;
import learnedma.generated.valuedomains.Key;
import learnedma.generated.valuedomains.OpenCurlyBracket;
import learnedma.generated.valuedomains.Optional;
import learnedma.generated.valuedomains.Value;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.JSONBuilderImpl;
import learnedma.generated.valuedomains.impl.JSONImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: JSON
 */
public abstract class JSON implements Comparable<JSON>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(28);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The JSON from the terminal
     */
    public static JSON fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new JSONImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The JSON from the string representation
     */
    public static JSON fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new JSONImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The JSON read from the stream
     */
    public static JSON fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new JSONImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The JSON read from the stream
     */
    public static JSON fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new JSONImpl(res);
    }

    /**
     * Starts creation of a new JSON
     * @return  Builder interface to set the openCurlyBracket field
     */
    public static JSONBuilderOpenCurlyBracket create()
    {
        return new JSONBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field openCurlyBracket
     * @return  The value of the field openCurlyBracket
     */
    public abstract OpenCurlyBracket openCurlyBracket();

    /**
     * returns the value of the field key
     * @return  The value of the field key
     */
    public abstract Key key();

    /**
     * returns the value of the field colon
     * @return  The value of the field colon
     */
    public abstract Colon colon();

    /**
     * returns the value of the field value
     * @return  The value of the field value
     */
    public abstract Value value();

    /**
     * returns the value of the field optionalExtras
     * @return  The value of the field optionalExtras
     */
    public abstract Optional optionalExtras();

    /**
     * returns the value of the field closeCurlyBracket
     * @return  The value of the field closeCurlyBracket
     */
    public abstract CloseCurlyBracket closeCurlyBracket();


    /**
     * Builder interface for setting the openCurlyBracket field of JSON
     */
    public interface JSONBuilderOpenCurlyBracket
    {

        /**
         * sets the openCurlyBracket field.
         * @param openCurlyBracket  The value to assign to the openCurlyBracket
         *                          field
         * @return                  Builder interface for setting the key field
         */
        public JSONBuilderKey openCurlyBracket(OpenCurlyBracket openCurlyBracket);

        /**
         * sets the openCurlyBracket field.
         * @param openCurlyBracket  The value to assign to the openCurlyBracket
         *                          field
         * @return                  Builder interface for setting the key field
         */
        public JSONBuilderKey openCurlyBracket(String openCurlyBracket) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the key field of JSON
     */
    public interface JSONBuilderKey
    {

        /**
         * sets the key field.
         * @param key  The value to assign to the key field
         * @return     Builder interface for setting the colon field
         */
        public JSONBuilderColon key(Key key);

        /**
         * sets the key field.
         * @param key  The value to assign to the key field
         * @return     Builder interface for setting the colon field
         */
        public JSONBuilderColon key(String key) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the colon field of JSON
     */
    public interface JSONBuilderColon
    {

        /**
         * sets the colon field.
         * @param colon  The value to assign to the colon field
         * @return       Builder interface for setting the value field
         */
        public JSONBuilderValue colon(Colon colon);

        /**
         * sets the colon field.
         * @param colon  The value to assign to the colon field
         * @return       Builder interface for setting the value field
         */
        public JSONBuilderValue colon(String colon) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the value field of JSON
     */
    public interface JSONBuilderValue
    {

        /**
         * sets the value field.
         * @param value  The value to assign to the value field
         * @return       Builder interface for setting the optionalExtras field
         */
        public JSONBuilderOptionalExtras value(Value value);

        /**
         * sets the value field.
         * @param value  The value to assign to the value field
         * @return       Builder interface for setting the optionalExtras field
         */
        public JSONBuilderOptionalExtras value(String value) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the optionalExtras field of JSON
     */
    public interface JSONBuilderOptionalExtras
    {

        /**
         * sets the optionalExtras field.
         * @param optionalExtras  The value to assign to the optionalExtras
         *                        field
         * @return                Builder interface for setting the
         *                        closeCurlyBracket field
         */
        public JSONBuilderCloseCurlyBracket optionalExtras(Optional optionalExtras);

        /**
         * sets the fieldoptionalExtras to null.
         * @return  Builder interface for setting the closeCurlyBracket field
         */
        public JSONBuilderCloseCurlyBracket noOptionalExtras();

    }



    /**
     * Builder interface for setting the closeCurlyBracket field of JSON
     */
    public interface JSONBuilderCloseCurlyBracket
    {

        /**
         * sets the closeCurlyBracket field.
         * @param closeCurlyBracket  The value to assign to the
         *                           closeCurlyBracket field
         * @return                   The created JSON value
         */
        public JSON closeCurlyBracket(CloseCurlyBracket closeCurlyBracket);

        /**
         * sets the closeCurlyBracket field.
         * @param closeCurlyBracket  The value to assign to the
         *                           closeCurlyBracket field
         * @return                   The created JSON value
         */
        public JSON closeCurlyBracket(String closeCurlyBracket) throws InvalidValueException;

    }

    @Override
    public String toString() {
        return "super.toString()";
    }
}
