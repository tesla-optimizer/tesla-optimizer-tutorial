# Tesla custom integration

Une fois HACS installé, vous pouvez ajouter l'intégration Tesla en suivant les explications disponibles [ici](https://github.com/alandtse/tesla#installation)

## Ajout du *repository* dans HACS et configuration
1. dans HACS, accéder à l'onglet *Integrations* et cliquer sur *Explore & Add Repositories* ![explore-and-add-button](.../explore-and-add-button.png)
2. chercher `Tesla` et choisir `https://github.com/alandtse/tesla` comme repository
3. redémarrer Home Assistant ( *Configuration -> Server Controls -> Server Management -> Restart* )
4. l'intégration Tesla est maintenant disponible dans *Configuration -> Integrations*
5. cliquer sur *Add Integration* en bas à droite ![add-integration-button](.../add-integration-button.png) et choisir *Tesla Custom Integration* ![tesla-custom-integration](.../tesla-custom-integration.png)

## Géneration d'un *token* Tesla

Pour que l'intégration Tesla puisse s'authentifier à votre compte, il lui faut un *token* (jeton). Pour générer ce jeton, le plus simple est d'utiliser une application à télécharger sur le smartphone, pour [IOS](https://apps.apple.com/us/app/auth-app-for-tesla/id1552058613) ou pour [Android](https://play.google.com/store/apps/details?id=net.leveugle.teslatokens).

Il suffit de copier le *Refresh Token* présenté et de le rentrer dans le dialogue de l'intégration, la connection devrait se faire ensuite toute seule. La voiture est ajoutée en tant que *device* ainsi que ses diverses *entities*, prêts à l'envoi de commandes et l'intégration sur tableaux de bord.

![tesla-configured](.../tesla-configured.png)