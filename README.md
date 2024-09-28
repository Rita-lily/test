# 合同管理系统 - 甲方与乙方

class Contract:
    def __init__(self, contract_id, party_a, party_b):
        self.contract_id = contract_id
        self.party_a = party_a  # 甲方
        self.party_b = party_b  # 乙方

    def test_contract(self):
        print(f"测试合同: {self.contract_id}")
        print(f"甲方: {self.party_a}")
        print(f"乙方: {self.party_b}")

# 示例使用
if __name__ == "__main__":
    contract = Contract("002", "公司甲", "公司乙")
    contract.test_contract()
