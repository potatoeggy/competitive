#include <algorithm>
#include <iostream>
#include <vector>
#include <ctype.h>
#include <string.h>
#define remettez return
#define csortie cout
#define centree cin
#define chaine string
#define principal main
#define ent int
#define ins std
#define si if
#define autre else
#define longueur length
#define cara char
#define sync_avec_esins sync_with_stdio
#define faux false
#define vrai true
#define attachez tie
#define ptrnul nullptr
#define pour for
#define souscha substr
#define obtenez_ligne getline
#define vecteur vector
#define pendant while
#define poussez push_back
#define taille size
#define amaju toupper
#define aminu tolower
#define a_chaine to_string
#define paire pair
#define classez sort
#define trouvez find
#define debut begin
#define fin end
#define revenez pop_back
#define premier first
#define taille_t size_t
#define cae stoi
#define deuxieme second

const ins::vecteur<ins::vecteur<ins::chaine>> pronomOrdre {
	{"le", "la", "les"},
	{"moi", "toi", "nous", "vous", "lui", "leur"},
	{"y"},
	{"en"}
};
const ins::chaine voyelles = "aeiouy";

ins::paire<ent, ins::chaine> determinePronomOrdre(ins::chaine mot) {
	si (mot == "me") mot = "moi";
	si (mot == "te") mot = "toi";
	pour (ent j = 0; j < pronomOrdre.taille(); j++) { // yikes double for
		pour (ent k = 0; k < pronomOrdre[j].taille(); k++) {
			si (mot == pronomOrdre[j][k]) {
				remettez {j, mot};
			}
		}
	}
	remettez {-1, ""};
}

ent principal() {
	ins::centree.sync_avec_esins(faux);
	ins::centree.attachez(ptrnul);

	ins::chaine stupideCpp;
	ins::obtenez_ligne(ins::centree, stupideCpp);
	ent lignes = ins::cae(stupideCpp);

	pour (ent i = 0; i < lignes; i++) {
		ins::vecteur<ins::chaine> ligne;
		ins::vecteur<ins::paire<ent, ins::chaine>> pronoms;
		ins::chaine temp;
		ins::obtenez_ligne(ins::centree, temp);
		// mini split is from so
		taille_t pos = 0;
		ins::chaine token;
		while ((pos = temp.find(' ')) != ins::chaine::npos) {
			ligne.poussez(temp.souscha(0, pos));
			temp.erase(0, pos + 1);
		}
		ligne.poussez(temp);

		pour (ent i = 2; i < ligne.taille(); i++) {
			si (ligne[i].trouvez("'") == ins::chaine::npos) {
				auto estVerbe = determinePronomOrdre(ligne[i]);
				si (estVerbe.premier != -1) pronoms.poussez(estVerbe);
			} autre {
				pronoms.poussez(determinePronomOrdre(ins::chaine(1, ligne[i][0]) + "e"));
				pronoms.poussez(determinePronomOrdre(ligne[i].souscha(2, ligne[i].longueur()))); // takes the bit after the apostrophe
				// i hate this
				// there are two scenarios: if the pronoun is attached to a verb or another pronoun
				// so what we need to do is to give verbs (things that are not in the database) a priority of -1 and handle it in the order function
				// that means verbs do not get special treatment below
			}
		}

		ins::classez(pronoms.debut(), pronoms.fin());

		ins::chaine infinitif = ligne[0].souscha(0, ligne[0].longueur() - 1);
		ins::chaine verbe = ligne[ligne.taille() - 1].souscha(0, ligne[ligne.taille() - 1].longueur() - 1);
		ins::chaine sujet = ligne[1]; // this will always be capitalised keep that in mind

		verbe[0] = ins::amaju(verbe[0]);
		bool infinitifEstRegulier = infinitif[infinitif.longueur() - 1] == 'r' && infinitif[infinitif.longueur() - 2] == 'e';
		// imperatives can be nous vous or tu but we're assuming it's always tu?

		ins::chaine phrase = verbe + "-";
		pour (ent i = 1; i < pronoms.taille(); i++) {
			si (voyelles.trouvez(pronoms[i].deuxieme[0]) != ins::chaine::npos) {
				si (pronoms[i-1].deuxieme == "moi" || pronoms[i-1].deuxieme == "toi" || pronoms[i-1].deuxieme == "le" || pronoms[i-1].deuxieme == "la") {
					phrase += pronoms[i-1].deuxieme[0] + "'";
				}
			} autre {
				phrase += pronoms[i-1].deuxieme + "-";
			}
		}
		si (pronoms.taille() > 0) phrase += pronoms[pronoms.taille()-1].deuxieme; // we run into segfault here if there are no pronouns
		// delete the if before since there should never be a scenario where you need the if
		
		// might as well do a full rewrite

		//si (phrase[phrase.longueur() - 1] == '-' || phrase[phrase.longueur() - 1] == '\'') phrase.revenez();
		ins::csortie << phrase << " !\n";
	}

	remettez 0;
}
