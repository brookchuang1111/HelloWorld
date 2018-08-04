/******************************************************************************
 *  Name:
 *
 *  Description: 
 *
 *  Determines whether a DNA string corresponds to a potential gene
 *      - length is a multiple of 3
 *      - starts with the start codon (ATG)
 *      - ends with a stop codon (TAA or TAG or TGA)
 *      - has no intervening stop codons
 *
 *  % java PotentialGene ATGCGCCTGCGTCTGTACTAG
 *  true
 *
 *  % java PotentialGene ATGCGCTGCGTCTGTACTAG
 *  false
 *
 ******************************************************************************/

public class PotentialGene {

    public static boolean isPotentialGene(String dna) {

        // Length is a multiple of 3.
        if (dna.length() % 3 != 0) return false;

        // Starts with start codon. Otherwise, return 

        // No intervening stop codons:  Iteratively, construct codon by staring 
	// with the 3rd character:
	//    -- Each codon is a substring of length 3.  
	//    -- If any of the codons equal stop codon, we got an intervening stop codon
	//       and hence, string is not a potential gene.
        for (int i = 3; i < dna.length() - 3; i++) {
            if (i % 3 == 0) {
	        // Construct codon of length 3 and check
            }
        }

        // Ends with a stop codon.  If it does, return true.


	// Didn't end with a stop codon.
	return false;
    }


    public static void main(String[] args) {
        String dna = args[0];
        StdOut.println(isPotentialGene(dna));
    }
}

