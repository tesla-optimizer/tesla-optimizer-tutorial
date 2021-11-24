# Tableau de bord
Voici un exemple de tableau de bord simple pour activer/désactiver l'automatisation, le "max range" et suivre l'évolution de la charge. Ce tableau de bord fonctionne aussi sur l'app.

![dashboard](.../dashboard.png)

## Marche à suivre
1. Pour rajouter un onglet spécialisé dans le menu à gauche avec ce tableau de bord, se rendre dans *[Configuration -> Lovelace Dashboards](http://homeassistant.local:8123/config/lovelace/dashboards)*. Cliquer sur le bouton *Add Dashboard* en bas à droite et entrer un nom, par exemple "Tesla energy management".
2. Ouvrir le dashboard et choisir *Edit Dashboard* dans le menu en haut à droite (les trois points)
3. Dans le dialogue, cocher *Start with an empty dashboard* et choisir *Take control*
4. Cliquer à nouveau dans le menu en haut à droite et choisir *Raw configuration editor*
5. Coller et adapter la configuration suivante:

```yaml
title: Tesla energy management
views:
  - path: default_view
    title: Home
    cards:
      - type: glance
        entities:
          - entity: binary_sensor.ferrite_online_sensor
      - type: gauge
        entity: sensor.ferrite_battery_sensor
        min: 0
        max: 100
      - type: button
        tap_action:
          action: toggle
        entity: switch.ferrite_charger_switch
        show_state: true
      - type: history-graph
        entities:
          - entity: sensor.ferrite_charging_rate_sensor
        hours_to_show: 24
        refresh_interval: 0
      - type: gauge
        entity: sensor.ferrite_range_sensor
        min: 0
        max: 430
      - type: entities
        entities:
          - entity: automation.charge_ferrite_off_hours
          - entity: automation.stop_charging_ferrite_after_off_hours
          - entity: automation.charge_ferrite_when_solar_production_above_threshold
          - entity: automation.stop_charging_ferrite_when_solar_production_too_low
        title: Automation
      - type: map
        entities:
          - device_tracker.ferrite_location_tracker
        title: Ferrite location
        dark_mode: true
      - type: history-graph
        entities:
          - entity: sensor.ferrite_target_amps
          - entity: sensor.ferrite_target_amps_filtered
          - entity: sensor.prise_garage_current
        refresh_interval: 0
        title: Amps
        hours_to_show: 1
      - type: button
        tap_action:
          action: toggle
        entity: switch.ferrite_maxrange_switch
        show_state: true
```
