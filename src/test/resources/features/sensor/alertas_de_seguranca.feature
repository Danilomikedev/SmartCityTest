Feature: Teste de Adição de Alerta

  Scenario: Adicionar um alerta de segurança
    Given que um alerta de segurança está preparado
    When eu solicito a adição do alerta
    Then o alerta deve ser adicionado com sucesso
