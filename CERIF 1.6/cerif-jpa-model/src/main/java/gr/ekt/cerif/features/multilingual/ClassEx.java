/**
 * 
 */
package gr.ekt.cerif.features.multilingual;

import gr.ekt.cerif.entities.second.Language;
import gr.ekt.cerif.features.semantics.Class;
import gr.ekt.cerif.features.semantics.ClassScheme;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * Holds the multi-lingual ex of a class entity.
 * 
 */
@Entity
@Table(name="cfClassEx", uniqueConstraints=@UniqueConstraint(columnNames={"cfClassId","cfClassSchemeId","cfLangCode","cfTrans"}))
public class ClassEx implements CerifMultipleLanguageFeature {
	
	/**
	 * Serialization version.
	 */
	private static final long serialVersionUID = 6903561441681935193L;	
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/**
	 * The class.
	 */
	@ManyToOne(optional=false)
	@JoinColumn(name="cfClassId")
	private Class theClass;
	
	/**
	 * The class scheme.
	 */
	@ManyToOne(optional=false)
	@JoinColumn(name="cfClassSchemeId")
	private ClassScheme classScheme;
	
	/**
	 * The language.
	 */
	@ManyToOne(optional=false)
	@JoinColumn(name="cfLangCode")
	private Language language;
	
	/**
	 * The translation.
	 */
	@NotNull
	@Column(name="cfTrans")
	@Enumerated(EnumType.STRING)
	private Translation translation;
	
	/**
	 * The class ex.
	 */
	@NotNull
	@Column(name="cfEx", length=10600)
	private String ex;
	
	/**
	 * The class ex source.
	 */
	@Column(name="cfExSrc", length=10600)
	private String exSrc;


	/**
	 * Default Constructor
	 */
	public ClassEx() {
		
	}
	
	/**
	 * 
	 * @param theClass
	 * @param classScheme
	 * @param language
	 * @param translation
	 * @param ex
	 * @param exSrc
	 */
	public ClassEx(Class theClass, ClassScheme classScheme, Language language,
			Translation translation, String ex, String exSrc) {
		this.theClass = theClass;
		this.classScheme = classScheme;
		this.language = language;
		this.translation = translation;
		this.ex = ex;
		this.exSrc = exSrc;
	}


	/**
	 * @return the theClass
	 */
	public Class getTheClass() {
		return theClass;
	}


	/**
	 * @param theClass the theClass to set
	 */
	public void setTheClass(Class theClass) {
		this.theClass = theClass;
	}


	/**
	 * @return the classScheme
	 */
	public ClassScheme getClassScheme() {
		return classScheme;
	}


	/**
	 * @param classScheme the classScheme to set
	 */
	public void setClassScheme(ClassScheme classScheme) {
		this.classScheme = classScheme;
	}


	/**
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}


	/**
	 * @param language the language to set
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}


	/**
	 * @return the translation
	 */
	public Translation getTranslation() {
		return translation;
	}


	/**
	 * @param translation the translation to set
	 */
	public void setTranslation(Translation translation) {
		this.translation = translation;
	}

	/**
	 * @return the ex
	 */
	public String getEx() {
		return ex;
	}

	/**
	 * @param ex the ex to set
	 */
	public void setEx(String ex) {
		this.ex = ex;
	}

	/**
	 * @return the exSrc
	 */
	public String getExSrc() {
		return exSrc;
	}

	/**
	 * @param exSrc the exSrc to set
	 */
	public void setExSrc(String exSrc) {
		this.exSrc = exSrc;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((classScheme == null) ? 0 : classScheme.hashCode());
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result
				+ ((theClass == null) ? 0 : theClass.hashCode());
		result = prime * result
				+ ((translation == null) ? 0 : translation.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassEx other = (ClassEx) obj;
		if (classScheme == null) {
			if (other.classScheme != null)
				return false;
		} else if (!classScheme.equals(other.classScheme))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (theClass == null) {
			if (other.theClass != null)
				return false;
		} else if (!theClass.equals(other.theClass))
			return false;
		if (translation != other.translation)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClassEx [id=" + id + ", classScheme=" + classScheme
				+ ", language=" + language + ", translation=" + translation
				+ ", ex=" + ex + ", exSrc=" + exSrc + "]";
	}
	
	
}
