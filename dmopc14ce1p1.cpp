#include <iostream>
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
#define attachez tie
#define ptrnul nullptr

// ent = entier, not sure if that works
// ins = institution standard? best i could find from gc.ca
// sync_avec_esins = sync_with_(entree)(sortie)(institution standard)

ent principal() {
	ins::centree.sync_avec_esins(faux);
	ins::centree.attachez(ptrnul);
	ins::chaine verbe, objet;
	ins::centree >> verbe >> objet;

	cara fin = objet[objet.longueur() - 1];
	ins::chaine articleDefinis;
	si (fin == 'e') articleDefinis = "la";
	autre si (fin == 's') articleDefinis = "les";
	autre articleDefinis = "le";

	ins::csortie << verbe << "-tu " << articleDefinis << " " << objet << " ?\n";
	remettez 0;
}