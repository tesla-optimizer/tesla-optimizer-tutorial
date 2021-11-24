# Installation de Home-Assistant

L'installation de Home-Assistant est très facile, il suffit de suivre les étapes décrites [ici](https://www.home-assistant.io/installation/raspberrypi#write-the-image-to-your-boot-media).


## Flash
Il s'agit en résumé d'insérer votre carte MicroSD dans le lecteur de carte sur votre PC ou votre Mac, de télécharger le programme [Balena Etcher](https://www.balena.io/etcher) et de flash l'image de Home Assistant dessus juste en saisissant l'URL de l'image disque correspondante `https://github.com/home-assistant/operating-system/releases/download/6.6/haos_rpi4-64-6.6.img.xz` (adaptée pour le @ref:[matériel](materiel.md) suggéré).
![etcher](.../etcher.png)


## Démarage
Insérez ensuite la carte MicroSD dans votre Rasberry, branchez-le au réseau via le cable ethernet, branchez-le au secteur via l'alimentation adaptée et vous devriez pouvoir vous connecter après quelques minutes sur [http://homeassistant.local:8123/](http://homeassistant.local:8123/)

![ha-account](.../ha-account.png)

@@@ note { .info }
Ce qui est flash sur la carte est le *système d'exploitation* Home Assistant ( *HAOS* ), qui est un Linux dédié pour faire tourner le programme Home Assistant ( *HA* ) lui-même. Il est bien entendu possible de faire tourner HA sur un autre OS, nous proposons ici la procédure d'installation la plus facile.
@@@

## HACS
Pour l'installation de l'intégration Tesla, nous avons besoin du module [HACS](https://hacs.xyz/) (Community Store). Cette étape est peut-être la plus délicate au niveau logiciel car il faut utiliser SSH et la ligne de commande. Il suffit toutefois de suivre les instructions [ici](https://hacs.xyz/docs/setup/download#home-assistant-os). 

En résumé, la procédure est la suivante:

 1. installer un *add-on* SSH: ![ssh-add-on](.../ssh-add-on.png)
 2. une fois installé, cliquer sur le bouton pour accéder à la console ![web-ui-button](.../web-ui-button.png)
 3. entrer `wget -O - https://get.hacs.xyz | bash -` dans la console pour lancer d'installation de HACS
 4. redémarrez éventuellement Home Assistant si nécessaire ( *Configuration -> Server Controls -> Server Management -> Restart* )
 5. vous devriez voir apparaître l'onglet *HACS* dans le menu à gauche: ![hacs-button](.../hacs-button.png)