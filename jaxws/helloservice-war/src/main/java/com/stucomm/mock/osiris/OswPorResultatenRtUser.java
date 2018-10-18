
package com.stucomm.mock.osiris;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OswPorResultatenRtUser complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OswPorResultatenRtUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://osiris/services/ResultaatService.wsdl/types/}OswPorResultatenRtBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="honorairePunten" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="voldoende" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cursuscode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="langeNaamCursus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="studentnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultaat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="onderwerp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mutatiedatumTekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mutatiedatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="korteNaamCursus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toetsdatumTekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toetsomschrijving" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="punten" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="toetsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="weging" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OswPorResultatenRtUser", propOrder = {
    "honorairePunten",
    "voldoende",
    "cursuscode",
    "langeNaamCursus",
    "studentnummer",
    "status",
    "resultaat",
    "docent",
    "onderwerp",
    "mutatiedatumTekst",
    "mutatiedatum",
    "korteNaamCursus",
    "toetsdatumTekst",
    "toetsomschrijving",
    "punten",
    "toetsdatum",
    "weging"
})
public class OswPorResultatenRtUser
    extends OswPorResultatenRtBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal honorairePunten;
    @XmlElement(required = true, nillable = true)
    protected String voldoende;
    @XmlElement(required = true, nillable = true)
    protected String cursuscode;
    @XmlElement(required = true, nillable = true)
    protected String langeNaamCursus;
    @XmlElement(required = true, nillable = true)
    protected String studentnummer;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected String resultaat;
    @XmlElement(required = true, nillable = true)
    protected String docent;
    @XmlElement(required = true, nillable = true)
    protected String onderwerp;
    @XmlElement(required = true, nillable = true)
    protected String mutatiedatumTekst;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mutatiedatum;
    @XmlElement(required = true, nillable = true)
    protected String korteNaamCursus;
    @XmlElement(required = true, nillable = true)
    protected String toetsdatumTekst;
    @XmlElement(required = true, nillable = true)
    protected String toetsomschrijving;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal punten;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toetsdatum;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal weging;

    /**
     * Gets the value of the honorairePunten property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHonorairePunten() {
        return honorairePunten;
    }

    /**
     * Sets the value of the honorairePunten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHonorairePunten(BigDecimal value) {
        this.honorairePunten = value;
    }

    /**
     * Gets the value of the voldoende property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoldoende() {
        return voldoende;
    }

    /**
     * Sets the value of the voldoende property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoldoende(String value) {
        this.voldoende = value;
    }

    /**
     * Gets the value of the cursuscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursuscode() {
        return cursuscode;
    }

    /**
     * Sets the value of the cursuscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursuscode(String value) {
        this.cursuscode = value;
    }

    /**
     * Gets the value of the langeNaamCursus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangeNaamCursus() {
        return langeNaamCursus;
    }

    /**
     * Sets the value of the langeNaamCursus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangeNaamCursus(String value) {
        this.langeNaamCursus = value;
    }

    /**
     * Gets the value of the studentnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentnummer() {
        return studentnummer;
    }

    /**
     * Sets the value of the studentnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentnummer(String value) {
        this.studentnummer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the resultaat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultaat() {
        return resultaat;
    }

    /**
     * Sets the value of the resultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultaat(String value) {
        this.resultaat = value;
    }

    /**
     * Gets the value of the docent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocent() {
        return docent;
    }

    /**
     * Sets the value of the docent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocent(String value) {
        this.docent = value;
    }

    /**
     * Gets the value of the onderwerp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnderwerp() {
        return onderwerp;
    }

    /**
     * Sets the value of the onderwerp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnderwerp(String value) {
        this.onderwerp = value;
    }

    /**
     * Gets the value of the mutatiedatumTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutatiedatumTekst() {
        return mutatiedatumTekst;
    }

    /**
     * Sets the value of the mutatiedatumTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutatiedatumTekst(String value) {
        this.mutatiedatumTekst = value;
    }

    /**
     * Gets the value of the mutatiedatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMutatiedatum() {
        return mutatiedatum;
    }

    /**
     * Sets the value of the mutatiedatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMutatiedatum(XMLGregorianCalendar value) {
        this.mutatiedatum = value;
    }

    /**
     * Gets the value of the korteNaamCursus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorteNaamCursus() {
        return korteNaamCursus;
    }

    /**
     * Sets the value of the korteNaamCursus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorteNaamCursus(String value) {
        this.korteNaamCursus = value;
    }

    /**
     * Gets the value of the toetsdatumTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToetsdatumTekst() {
        return toetsdatumTekst;
    }

    /**
     * Sets the value of the toetsdatumTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToetsdatumTekst(String value) {
        this.toetsdatumTekst = value;
    }

    /**
     * Gets the value of the toetsomschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToetsomschrijving() {
        return toetsomschrijving;
    }

    /**
     * Sets the value of the toetsomschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToetsomschrijving(String value) {
        this.toetsomschrijving = value;
    }

    /**
     * Gets the value of the punten property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPunten() {
        return punten;
    }

    /**
     * Sets the value of the punten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPunten(BigDecimal value) {
        this.punten = value;
    }

    /**
     * Gets the value of the toetsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToetsdatum() {
        return toetsdatum;
    }

    /**
     * Sets the value of the toetsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToetsdatum(XMLGregorianCalendar value) {
        this.toetsdatum = value;
    }

    /**
     * Gets the value of the weging property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeging() {
        return weging;
    }

    /**
     * Sets the value of the weging property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeging(BigDecimal value) {
        this.weging = value;
    }

}
