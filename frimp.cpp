#include <algorithm>
#include <iostream>
#include <vector>
#include <ctype.h>
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

const ins::vecteur<ins::vecteur<ins::chaine>> pronomOrdre {
	{"le", "la", "les"},
	{"moi", "toi", "nous", "vous", "lui", "leur"},
	{"y"},
	{"en"}
};

ent determinePronomOrdre(ins::chaine mot) {
	si (mot == "me") mot = "moi";
	si (mot == "te") mot == "toi";
	pour (ent j = 0; j < pronomOrdre.taille(); j++) { // yikes double for
		pour (ent k = 0; k < pronomOrdre[j].taille(); k++) {
			si (mot == pronomOrdre[j][k]) {
				remettez j;
			}
		}
	}
	remettez -1;
}

ent principal() {
	ins::centree.sync_avec_esins(faux);
	ins::centree.attachez(ptrnul);

	ent lignes; ins::centree >> lignes;

	pour (ent i = 0; i < lignes; i++) {
		ins::vecteur<ins::chaine> ligne;
		ins::vecteur<ins::paire<ent, ins::chaine>> pronoms;
		ins::chaine temp;
		pendant (ins::obtenez_ligne(ins::centree, temp, ' ')) {
			ligne.poussez(temp);
		}

		pour (ent i = 2; i < ligne.taille() - 1; i++) {
			si (ligne[i].trouvez("'") != ins::chaine::npos) {
				pronoms.poussez({determinePronomOrdre(ligne[i]), ligne[i]});
			} autre {
				pronoms.poussez({determinePronomOrdre(ligne[i][0] + "e"), ligne[i][0] + "e"});
				pronoms.poussez({determinePronomOrdre(ligne[i].souscha(2, ligne[i].longueur())), ligne[i].souscha(2, ligne[i].longueur())}); // takes the bit after the apostrophe
			}
		}

		ins::classez(pronoms.debut(), pronoms.fin());

		ins::chaine infinitif = ligne[0].souscha(0, ligne[0].longueur() - 1);
		ins::chaine verbe = ligne[ligne.taille() - 1].souscha(0, ligne[ligne.taille() - 1].longueur() - 1);
		ins::chaine sujet = ligne[1]; // this will always be capitalised keep that in mind

		verbe[0] = ins::amaju(verbe[0]);
		bool infinitifEstRegulier = infinitif[infinitif.longueur() - 1] == 'r' && infinitif[infinitif.longueur() - 2] == 'e';
		// comments say that there's some broken test data
		// imperatives can be nous vous or tu but we're assuming it's always tu?
		std::string phrase = verbe;
		ins::csortie << phrase << " !\n";
	}

	remettez 0;
}