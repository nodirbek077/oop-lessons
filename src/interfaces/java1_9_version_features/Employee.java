package interfaces.java1_9_version_features;

/**
 * sealed interfaces als have been added. And it allows us only restricted classes can implement this interface
 */
public sealed interface Employee permits Driver {
}
