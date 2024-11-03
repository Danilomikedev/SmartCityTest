Feature: Dados de Tráfego

  Scenario: Adicionar dados de tráfego
    Given que os dados de tráfego estão preparados
    When eu solicito a adição dos dados de tráfego
    Then os dados de tráfego devem ser adicionados com sucesso
