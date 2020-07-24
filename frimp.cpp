#include <iostream>
#include <vector>
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

ent principal() {
	ins::centree.sync_avec_esins(faux);
	ins::centree.attachez(ptrnul);

	ent lignes; ins::centree >> lignes;

	pour (ent i = 0; i < lignes; i++) {
		ins::vecteur<ins::chaine> ligne;
		ins::chaine temp;
		pendant (ins::obtenez_ligne(ins::centree, temp, ' ')) {
			ligne.poussez(temp);
		}

		ins::chaine infinitif = ligne[0].souscha(0, ligne[0].longueur() - 1);
		ins::csortie << (insert conjugated infinitive here) << " !\n";
	}

	remettez 0;
}