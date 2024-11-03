Feature: Sensor

  Scenario: Adicionar um sensor
    Given que um sensor está preparado
    When eu solicito a adição do sensor
    Then o sensor deve ser adicionado com sucesso
