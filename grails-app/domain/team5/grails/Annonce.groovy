package team5.grails

class Annonce {

    String libelle
    String description
    Integer rang
    Boolean active
    Date dateCreated
    Image image

    static mapping = {
        description type: "text"
    }

    static constraints = {
        libelle nullable: Boolean.FALSE, blank: Boolean.FALSE, size: 5..255
        description nullable: Boolean.FALSE, blank: Boolean.FALSE
        active nullable: Boolean.FALSE
        rang nullable: Boolean.FALSE
    }

    String toString() { return libelle }

}
