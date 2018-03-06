public enum Genre {

    FICTION("Books about things that have really happened"),
    NONFICTION("Books about things that haven't really happened");

    private String description;

    Genre(String description) {
        this.description = description;
    }

}
