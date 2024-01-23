package dev.joago.mi_alumno_api.document.types;

import dev.joago.mi_alumno_api.document.Content;

/**
 * The {@code Types} enum defines the types of UI Object's possible
 * representations in an application context. Here lay standard definition
 * for the possible forms that content can be presented in the page, each one
 * being rendered as the {@code type} field in {@link dev.joago.mi_alumno_api.document.Content} class.
 * <p></p>
 * <h2>Client Application behavior with Types:</h2>
 * <blockquote><pre>TEXT: Renders the {@code content} as a text, can be modifiable by changing weight, size, font, etc.</pre></blockquote>
 * <blockquote><pre>HEADER: Same as a text, but using header tags.</pre></blockquote>
 * <blockquote><pre>IMAGE: Renders an image, takes {@code url} and {@code properties} in consideration.</pre></blockquote>
 * <blockquote><pre>LINK: Considers {@code href} property and creates a link.</pre></blockquote>
 * <blockquote><pre>CARD: Considers {@code url}, {@code href}, {@code content} for the card.</pre></blockquote>
 * <blockquote><pre>TABLE: {@code rows} and {@code cols} are used by the Client to create a table, {@code content} is treated as the name of the table.</pre></blockquote>
 * <blockquote><pre>DOCUMENT: Takes {@code url} and {@code content} as name, {@code url} is used to generate a link to the document's download mirror.</pre></blockquote>
 * <blockquote><pre>DIVIDER: Created an empty object taking {@code properties}'s height or width.</pre></blockquote>
 * <blockquote><pre>LIST: Creates a list considering {@code items} as the items, and {@code content} as name of the list.</pre></blockquote>
 *
 * @author Joaquín Gómez
 * @version 1.0
 * @implNote This enum is implemented in the {@link Content} class
 * its importance relays in the UI rendering for the Portals defined in
 * {@link dev.joago.mi_alumno_api.portal.Portal} class.
 **/

public enum Types {
    TEXT, HEADER, IMAGE, LINK, CARD, TABLE, DOCUMENT, DIVIDER, LIST
}


