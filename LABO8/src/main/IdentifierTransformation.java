public class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase( String identifier ) {

        char[] workString = snakeCaseIdentifierToCamelCase(identifier).toCharArray();

        if ( workString.length > 0 ) {

            workString[ 0 ] = Character.toUpperCase( workString[ 0 ] );

        }

        return new String( workString );

    }


    public static String snakeCaseIdentifierToCamelCase( String identifier ) {

        StringBuilder workString = new StringBuilder();

        for ( int charIndex = 0; charIndex < identifier.length() ; charIndex++ ) {

            if ( identifier.charAt( charIndex ) == '_' ) {

                if ( charIndex != 0 && charIndex != identifier.length()-1 ) {

                    workString.append( Character.toUpperCase( identifier.charAt( ++charIndex ) ) );

                }

            } else {

                workString.append( Character.toLowerCase( identifier.charAt( charIndex ) ) );

            }

        }

        return workString.toString();

    }

}
