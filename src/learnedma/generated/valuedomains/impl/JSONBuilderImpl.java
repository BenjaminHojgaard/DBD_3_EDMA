package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.CloseCurlyBracket;
import learnedma.generated.valuedomains.Colon;
import learnedma.generated.valuedomains.JSON;
import learnedma.generated.valuedomains.JSON.JSONBuilderCloseCurlyBracket;
import learnedma.generated.valuedomains.JSON.JSONBuilderColon;
import learnedma.generated.valuedomains.JSON.JSONBuilderKey;
import learnedma.generated.valuedomains.JSON.JSONBuilderOpenCurlyBracket;
import learnedma.generated.valuedomains.JSON.JSONBuilderOptionalExtras;
import learnedma.generated.valuedomains.JSON.JSONBuilderValue;
import learnedma.generated.valuedomains.Key;
import learnedma.generated.valuedomains.OpenCurlyBracket;
import learnedma.generated.valuedomains.Optional;
import learnedma.generated.valuedomains.Value;
import learnedma.generated.valuedomains.impl.CloseCurlyBracketImpl;
import learnedma.generated.valuedomains.impl.ColonImpl;
import learnedma.generated.valuedomains.impl.KeyImpl;
import learnedma.generated.valuedomains.impl.OpenCurlyBracketImpl;
import learnedma.generated.valuedomains.impl.ValueImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class JSONBuilderImpl implements JSONBuilderCloseCurlyBracket, JSONBuilderColon, JSONBuilderKey, JSONBuilderOpenCurlyBracket, JSONBuilderOptionalExtras, JSONBuilderValue
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public JSONBuilderImpl()
    {
        edma_value = new Object[6];
    }

    /**
     * sets the openCurlyBracket field.
     * @param openCurlyBracket  The value to assign to the openCurlyBracket
     *                          field
     * @return                  Builder interface for setting the key field
     */
    public JSONBuilderKey openCurlyBracket(OpenCurlyBracket openCurlyBracket)
    {
        if(openCurlyBracket == null) throw new NullPointerException("The field openCurlyBracket in JSON may not be null");
        edma_value[0] = ((IValueInstance) openCurlyBracket).edma_getValue();
        return this;
    }

    /**
     * sets the openCurlyBracket field.
     * @param openCurlyBracket  The value to assign to the openCurlyBracket
     *                          field
     * @return                  Builder interface for setting the key field
     */
    public JSONBuilderKey openCurlyBracket(String openCurlyBracket) throws InvalidValueException
    {
        if(openCurlyBracket != null) OpenCurlyBracketImpl.edma_validate(openCurlyBracket);
        if(openCurlyBracket == null) throw new NullPointerException();
        edma_value[0] = OpenCurlyBracketImpl.edma_create(openCurlyBracket);
        return this;
    }

    /**
     * sets the key field.
     * @param key  The value to assign to the key field
     * @return     Builder interface for setting the colon field
     */
    public JSONBuilderColon key(Key key)
    {
        if(key == null) throw new NullPointerException("The field key in JSON may not be null");
        edma_value[1] = ((IValueInstance) key).edma_getValue();
        return this;
    }

    /**
     * sets the key field.
     * @param key  The value to assign to the key field
     * @return     Builder interface for setting the colon field
     */
    public JSONBuilderColon key(String key) throws InvalidValueException
    {
        if(key != null) KeyImpl.edma_validate(key);
        if(key == null) throw new NullPointerException();
        edma_value[1] = KeyImpl.edma_create(key);
        return this;
    }

    /**
     * sets the colon field.
     * @param colon  The value to assign to the colon field
     * @return       Builder interface for setting the value field
     */
    public JSONBuilderValue colon(Colon colon)
    {
        if(colon == null) throw new NullPointerException("The field colon in JSON may not be null");
        edma_value[2] = ((IValueInstance) colon).edma_getValue();
        return this;
    }

    /**
     * sets the colon field.
     * @param colon  The value to assign to the colon field
     * @return       Builder interface for setting the value field
     */
    public JSONBuilderValue colon(String colon) throws InvalidValueException
    {
        if(colon != null) ColonImpl.edma_validate(colon);
        if(colon == null) throw new NullPointerException();
        edma_value[2] = ColonImpl.edma_create(colon);
        return this;
    }

    /**
     * sets the value field.
     * @param value  The value to assign to the value field
     * @return       Builder interface for setting the optionalExtras field
     */
    public JSONBuilderOptionalExtras value(Value value)
    {
        if(value == null) throw new NullPointerException("The field value in JSON may not be null");
        edma_value[3] = ((IValueInstance) value).edma_getValue();
        return this;
    }

    /**
     * sets the value field.
     * @param value  The value to assign to the value field
     * @return       Builder interface for setting the optionalExtras field
     */
    public JSONBuilderOptionalExtras value(String value) throws InvalidValueException
    {
        if(value != null) ValueImpl.edma_validate(value);
        if(value == null) throw new NullPointerException();
        edma_value[3] = ValueImpl.edma_create(value);
        return this;
    }

    /**
     * sets the optionalExtras field.
     * @param optionalExtras  The value to assign to the optionalExtras field
     * @return                Builder interface for setting the
     *                        closeCurlyBracket field
     */
    public JSONBuilderCloseCurlyBracket optionalExtras(Optional optionalExtras)
    {
        edma_value[4] = (optionalExtras == null ? null : (((IValueInstance) optionalExtras).edma_getValue()));
        return this;
    }

    /**
     * sets the fieldoptionalExtras to null.
     * @return  Builder interface for setting the closeCurlyBracket field
     */
    public JSONBuilderCloseCurlyBracket noOptionalExtras()
    {
        edma_value[4] = null;
        return this;
    }

    /**
     * sets the closeCurlyBracket field.
     * @param closeCurlyBracket  The value to assign to the closeCurlyBracket
     *                           field
     * @return                   The created JSON value
     */
    public JSON closeCurlyBracket(CloseCurlyBracket closeCurlyBracket)
    {
        if(closeCurlyBracket == null) throw new NullPointerException("The field closeCurlyBracket in JSON may not be null");
        edma_value[5] = ((IValueInstance) closeCurlyBracket).edma_getValue();
        return new JSONImpl(JSONImpl.edma_create(edma_value));
    }

    /**
     * sets the closeCurlyBracket field.
     * @param closeCurlyBracket  The value to assign to the closeCurlyBracket
     *                           field
     * @return                   The created JSON value
     */
    public JSON closeCurlyBracket(String closeCurlyBracket) throws InvalidValueException
    {
        if(closeCurlyBracket != null) CloseCurlyBracketImpl.edma_validate(closeCurlyBracket);
        if(closeCurlyBracket == null) throw new NullPointerException();
        edma_value[5] = CloseCurlyBracketImpl.edma_create(closeCurlyBracket);
        return new JSONImpl(JSONImpl.edma_create(edma_value));
    }

}
